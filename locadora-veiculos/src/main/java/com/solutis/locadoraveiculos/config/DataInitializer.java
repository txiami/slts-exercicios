package com.solutis.locadoraveiculos.config;

import com.solutis.locadoraveiculos.entity.*;
import com.solutis.locadoraveiculos.entity.enums.Categoria;
import com.solutis.locadoraveiculos.entity.enums.Sexo;
import com.solutis.locadoraveiculos.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner initData(AcessorioRepository acessorioRepository,
                                      FabricanteRepository fabricanteRepository,
                                      ModeloCarroRepository modeloCarroRepository,
                                      CarroRepository carroRepository,
                                      ApoliceSeguroRepository apoliceSeguroRepository,
                                      CadastroClienteRepository cadastroClienteRepository,
                                      AluguelRepository aluguelRepository) {
        return args -> {

            Acessorio acessorio1 = new Acessorio(null,"Airbag");
            Acessorio acessorio2 = new Acessorio(null, "Central multimídia");
            acessorioRepository.save(acessorio1);
            acessorioRepository.save(acessorio2);

            Fabricante fabricante1 = new Fabricante("Toyota");
            Fabricante fabricante2 = new Fabricante("Honda");
            fabricanteRepository.save(fabricante1);
            fabricanteRepository.save(fabricante2);

            ModeloCarro modelo1 = new ModeloCarro("Sedan", Categoria.SEDAN_COMPACTO, fabricante1);
            ModeloCarro modelo2 = new ModeloCarro("Minivan", Categoria.MINIVAN, fabricante2);
            modeloCarroRepository.save(modelo1);
            modeloCarroRepository.save(modelo2);
            Carro carro1 = new Carro("ABC1234", "12345678901234567", "Azul", "https://example.com/car1.jpg", new BigDecimal("150.00"), modelo1);
            carro1.getAcessorios().add(acessorio1);
            Carro carro2 = new Carro("XYZ5678", "98765432109876543", "Vermelho", "https://example.com/car2.jpg", new BigDecimal("200.00"), modelo2);
            carro2.getAcessorios().add(acessorio2);
            carroRepository.save(carro1);
            carroRepository.save(carro2);

            ApoliceSeguro apolice1 = new ApoliceSeguro(new BigDecimal("1000.00"), true, true, true);
            ApoliceSeguro apolice2 = new ApoliceSeguro(new BigDecimal("1500.00"), false, true, false);
            apoliceSeguroRepository.save(apolice1);
            apoliceSeguroRepository.save(apolice2);

            Funcionario funcionario1 = new Funcionario("Carlos Oliveira", LocalDate.of(1985, 3, 10),"306.842.908-04",Sexo.MASCULINO,"10342");
            Funcionario funcionario2 = new Funcionario("Ana Santos", LocalDate.of(1995, 11, 8), "901.438.960-40", Sexo.FEMININO, "13456");
            cadastroClienteRepository.save(funcionario1);
            cadastroClienteRepository.save(funcionario2);

            Motorista motorista1 = new Motorista("João Silva", LocalDate.of(1990, 5, 15), "89151920018",  Sexo.MASCULINO, "9587536178");
            Motorista motorista2 = new Motorista("Maria Souza", LocalDate.of(1988, 9, 20), "15198499072", Sexo.FEMININO, "4594576660");

            cadastroClienteRepository.save(motorista1);
            cadastroClienteRepository.save(motorista2);

            Aluguel aluguel1 = new Aluguel(Calendar.getInstance(), LocalDate.of(2023, 9, 10), LocalDate.of(2023, 9, 15), apolice1, motorista1, carro1);
            Aluguel aluguel2 = new Aluguel(Calendar.getInstance(), LocalDate.of(2023, 8, 23), LocalDate.of(2023, 8, 23), apolice2, motorista2, carro2);
            aluguelRepository.save(aluguel1);
            aluguelRepository.save(aluguel2);

        };
    }



}

