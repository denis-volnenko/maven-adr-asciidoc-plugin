package ru.volnenko.maven.plugin.adr;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mojo(name = "generate", defaultPhase = LifecyclePhase.COMPILE)
public final class Generator extends AbstractMojo {

    @NonNull
    private static final String TITLE = "title";

    @NonNull
    private static final String GROUP = "group";

    @NonNull
    private static final String GENERATE = "generate";

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
    @Parameter(property = "responsibles")
    private List<String> responsibles;

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

    private Map<String, Object> getData() {
        @NonNull final Map<String, Object> result = new HashMap<String, Object>();
        result.put(TITLE, title);
        result.put(GROUP, group);
        return result;
    }

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

    }

    private void header() {

    }

}
