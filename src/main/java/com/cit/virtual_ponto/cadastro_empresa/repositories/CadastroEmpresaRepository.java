package com.cit.virtual_ponto.cadastro_empresa.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cit.virtual_ponto.cadastro_empresa.models.EmpresaEntity;

public interface CadastroEmpresaRepository extends JpaRepository<EmpresaEntity, Long> {
    
    Optional<EmpresaEntity> findByEmail(String email);

    Optional<EmpresaEntity> findByCnpj(String cnpj);

    Optional<EmpresaEntity> findByTelefone(String telefone);
}
