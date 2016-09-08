package com.example;

import com.example.mod2.UsefulClass;
import org.gradle.api.Plugin;
import org.gradle.api.invocation.Gradle;

public class InitPlugin implements Plugin<Gradle> {
    @Override
    public void apply(Gradle gradle) {
        gradle.projectsLoaded {
            gradle.rootProject.allprojects { proj ->
                proj.repositories.maven { url new UsefulClass().getArtifactoryInstance() }
            }
        }
    }
}
