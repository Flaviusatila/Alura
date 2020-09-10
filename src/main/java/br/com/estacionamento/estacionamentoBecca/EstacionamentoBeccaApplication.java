package br.com.estacionamento.estacionamentoBecca;

import br.com.estacionamento.estacionamentoBecca.utils.DammyData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class EstacionamentoBeccaApplication {

	public static void main(String[] args) {

		SpringApplication.run(EstacionamentoBeccaApplication.class, args);

	}


}
