package org.adainsys.sqltojava;

import org.adainsys.sqltojava.config.ApplicationProperties;
import org.adainsys.sqltojava.entity.JdlEntity;
import org.adainsys.sqltojava.service.logic.ExportService;
import org.adainsys.sqltojava.service.logic.JdlService;
import org.adainsys.sqltojava.service.logic.SqlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.List;

@EnableConfigurationProperties(ApplicationProperties.class)
@SpringBootApplication
public class SqlToJavaApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SqlToJavaApplication.class);

    private final ApplicationProperties applicationProperties;

    private final SqlService sqlService;

    private final JdlService jdlService;

    private final ExportService exportService;

    public SqlToJavaApplication(final ApplicationProperties applicationProperties, final SqlService sqlService, final JdlService jdlService, final ExportService exportService) {
        this.applicationProperties = applicationProperties;
        this.sqlService = sqlService;
        this.jdlService = jdlService;
        this.exportService = exportService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SqlToJavaApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        log.warn("Arguments passed: {}", args);
        final List<JdlEntity> entities = jdlService.buildEntities();

        exportService.export(entities);
    }

}
