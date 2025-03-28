package ru.volnenko.maven.plugin.adr;

import lombok.Getter;
import lombok.Setter;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import java.util.List;

@Mojo(name = "generate", defaultPhase = LifecyclePhase.COMPILE)
public final class Generator extends AbstractMojo {

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String group;

    @Getter
    @Setter
    private String status;

    @Getter
    @Setter
    private String date;

    @Getter
    @Setter
    private String issue;

    @Getter
    @Setter
    private String decision;

    @Getter
    @Setter
    private List<String> changeLog;

    @Getter
    @Setter
    private List<String> notes;

    @Getter
    @Setter
    private List<String> tags;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

    }

}
