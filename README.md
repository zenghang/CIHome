# CIHome

   基于当下的开源技术，本项目采用Github作为代码管理工具，Jenkins作为持续集成工具，并自己搭建MQ、FTP服务分别用来进行数据通信和产出存储。核心服务CIHome作为任务调度工具并提供部署流水线的展示。结构图如下：
</br>  
<img src="./CIHome.png" alt="cihome"/>
 
    1) 向Github提交代码后触发CIHome编译
    2) CIHome向Jenkins发送编译消息
    3) Jenkins收到消息触发编译，并返回编译结果
    4) 编译成功上传编译产出道FTP服务
    5) CIHome获得将临时编译产出打tag作为发布版本
    
</br>
    Github作为开源的代码管理工具提供了丰富的API供开发者调用，其中GitHook作为监听代码提交的钩子更是为本项目提供了有力的帮助，可以很方便的监听代码提交信息。而Jenkins所提倡的插件化机制也使得我们自己开发个性化的hpi用于本项目中。对于Apache所提供的MQ服务则可以提供数据关联的功能，并基于FTP协议开发新的服务作为产品库。



 
