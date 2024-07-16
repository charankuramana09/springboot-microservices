package net.javaguides.departmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@OpenAPIDefinition(
		info=@Info(
				title="Department Service REST APIs",
				description="Department Service REST APIs Documentation",
				version="v1.0",
				contact=@Contact(
						name="Charan",
						email="charan.kuramana@isigntech.com",
						url="https://github.com/"
						),
				license= @License(
						name="Apache 2.0",
						url="https://www.youtube.com/?reload=9"
						)
				),
		externalDocs = @ExternalDocumentation(
				description="Department.Service.Doc",
				url="https://www.youtube.com/?reload=9"
				)
		)

@SpringBootApplication
//@EnableEurekaClient
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
