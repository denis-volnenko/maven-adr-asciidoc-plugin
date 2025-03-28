package ru.volnenko.maven.plugin.adr;

import lombok.Getter;
import lombok.Setter;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.ArrayList;
import java.util.List;

@Mojo(name = "generate", defaultPhase = LifecyclePhase.COMPILE)
public final class Generator extends AbstractMojo {

    @Getter
    @Setter
    @Parameter(property = "title")
    private String title;

    @Getter
    @Setter
    @Parameter(property = "group")
    private String group;

    @Getter
    @Setter
    @Parameter(property = "status")
    private String status;

    @Getter
    @Setter
    @Parameter(property = "date")
    private String date;

    @Getter
    @Setter
    @Parameter(property = "issue")
    private String issue;

    @Getter
    @Setter
    @Parameter(property = "decision")
    private String decision;

    @Getter
    @Setter
    @Parameter(property = "changeLog")
    private List<String> changeLog;

    @Getter
    @Setter
    @Parameter(property = "notes")
    private List<String> notes;

    @Getter
    @Setter
    @Parameter(property = "tags")
    private List<String> tags;

    @Getter
    @Setter
    @Parameter(property = "files")
    private List<String> files = new ArrayList<>();

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

    }

}
