package com.zerjioang.apkr.v1.common.handlers.base;

import com.zerjioang.apkr.v1.common.datamodel.base.APKFile;
import com.zerjioang.apkr.v1.common.datamodel.base.ApkrProject;

import java.io.Serializable;

/**
 * Created by sergio on 16/2/16.
 */
public abstract class AbstractHandler implements Serializable {

    protected APKFile apk;
    protected Exception error;
    protected ApkrProject project;

    public abstract boolean doTheJob();

    public Exception getError() {
        return error;
    }

    public void setError(Exception error) {
        this.error = error;
    }

    public APKFile getApk() {
        return apk;
    }

    public void setApk(APKFile apk) {
        this.apk = apk;
    }

    public ApkrProject getProject() {
        return project;
    }

    public void setProject(ApkrProject project) {
        this.project = project;
    }
}