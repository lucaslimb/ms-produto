package br.com.fiap.ms_produto.dto;

public record ProdutoRequestDTO(
        String nome,
        String descricao,
        Double valor
) {
}
