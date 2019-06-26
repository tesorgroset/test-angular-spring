package com.example.demo;

import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


/**
 * Clase principal de spring boot donde arranca la aplicacion y se inicializan los datos
 * @author 67282558
 *
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
	
	
	@Bean
	public ApplicationRunner init(PersonRepository personRepository){
		return args -> {
			Stream.of(Arrays.asList("Luis","Virseda",25,"calle alcala num 345","alpha romeo","8765FRC"),
					  Arrays.asList("Pepe","Gomez",56,"avenida del castille num 12","renault megane","6581ERR")).forEach(p -> {
				Person ePerson = new Person();
				ePerson.setFirstName((String)p.get(0));
				ePerson.setLastName((String)p.get(1));
				ePerson.setEdad((Integer)p.get(2));
				ePerson.setDireccion((String)p.get(3));
				ePerson.setModeloCoche((String)p.get(4));
				ePerson.setMatricula((String)p.get(5));
				personRepository.save(ePerson);
			});
		};
	}
	
	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {

		return new RepositoryRestConfigurer() {
			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.exposeIdsFor(Person.class);
			}
		};
	}
	 	
	
}
