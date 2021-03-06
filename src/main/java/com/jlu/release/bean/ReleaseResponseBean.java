package com.jlu.release.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by niuwanpeng on 17/4/26.
 *
 * 回到发布接口响应bean
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReleaseResponseBean {

    private int releaseId;

    private String module;

    private String releaseProductPath;

    private ReleaseStatus releaseStatus;

    public ReleaseResponseBean() {

    }

    public ReleaseResponseBean(int releaseId, String module, String releaseProductPath,
                               ReleaseStatus releaseStatus) {
        this.releaseId = releaseId;
        this.module = module;
        this.releaseProductPath = releaseProductPath;
        this.releaseStatus = releaseStatus;
    }

    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(int releaseId) {
        this.releaseId = releaseId;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getReleaseProductPath() {
        return releaseProductPath;
    }

    public void setReleaseProductPath(String releaseProductPath) {
        this.releaseProductPath = releaseProductPath;
    }

    public ReleaseStatus getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(ReleaseStatus releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    @Override
    public String toString() {
        return "ReleaseResponseBean{" +
                "releaseId=" + releaseId +
                ", module='" + module + '\'' +
                ", releaseProductPath='" + releaseProductPath + '\'' +
                ", releaseStatus=" + releaseStatus +
                '}';
    }
}
