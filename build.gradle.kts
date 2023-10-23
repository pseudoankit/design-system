// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.gradleWrapperUpgrade)
}

wrapperUpgrade {
    gradle {
        create("design-system") {
            repo.set("pseudoankit/design-system")
            baseBranch.set("master")
        }
    }
}
