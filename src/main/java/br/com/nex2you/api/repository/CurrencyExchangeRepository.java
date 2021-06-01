package br.com.nex2you.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nex2you.api.entity.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
}
