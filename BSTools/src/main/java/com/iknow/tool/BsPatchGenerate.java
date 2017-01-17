package com.iknow.tool;

/**
 * Author：J.Chou
 * Date：  2017.01.17 12:15 PM
 * Email： who_know_me@163.com
 * Describe:
 */
public class BsPatchGenerate {
    /**
     * 合并
     * @param oldfile   老版本的apk文件路劲
     * @param newfile   新的apk文件路劲
     * @param patchfile 拆分后的文件路劲
     */
    public native static void patch(String oldfile, String newfile, String patchfile);

    static{
        System.loadLibrary("bspatch");
    }
}
