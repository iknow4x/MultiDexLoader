import org.gradle.api.Plugin
import org.gradle.api.Project

class MultiDexBuilderPlugin implements Plugin<Project> {

    static final String TASK_NAME = "assembleReleaseMultiDexApk"

    void apply(Project project) {
        project.task(TASK_NAME) << {
            println "Hello world!"
        }
    }
}
