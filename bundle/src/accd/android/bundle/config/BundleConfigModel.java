package accd.android.bundle.config;


import java.util.ArrayList;

/**
 * Created by yb.wang on 15/11/17.
 */
public class BundleConfigModel {
    public String moduleName;
    public String packageName;
    public String busObjectName;
    public BundleLoadType bundleLoadType;
    public ArrayList<String> dependenceList;
    public boolean isMain;
    public boolean isLoadInBackground;

    public BundleConfigModel(String moduleName, String packageName, String busObjectName, BundleLoadType bundleLoadType) {
        this(moduleName, packageName, busObjectName, bundleLoadType, false);
    }

    public BundleConfigModel(String moduleName, String packageName, String busObjectName, BundleLoadType bundleLoadType, boolean isMain) {
        this(moduleName, packageName, busObjectName, bundleLoadType, isMain, false);
    }

    public BundleConfigModel(String moduleName, String packageName, String busObjectName, BundleLoadType bundleLoadType, boolean isMain, boolean isLoadInBackground) {
        this(moduleName, packageName, busObjectName, bundleLoadType, isMain, isLoadInBackground, null);
    }

    public BundleConfigModel(String moduleName, String packageName, String busObjectName, BundleLoadType bundleLoadType, boolean isMain, boolean isLoadInBackground, ArrayList<String> dependenceList) {
        this.moduleName = moduleName;
        this.packageName = packageName;
        this.busObjectName = busObjectName;
        this.bundleLoadType = bundleLoadType;
        this.dependenceList = dependenceList;
        this.isMain = isMain;
        this.isLoadInBackground = isLoadInBackground;
    }

    public enum BundleLoadType {

        RemoteLoad(1), AutoLoad(1), LazyLoad(2);
        private int value;

        BundleLoadType(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }
}
