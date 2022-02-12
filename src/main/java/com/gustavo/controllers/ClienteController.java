package com.gustavo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.domains.Cliente;
import com.gustavo.domains.Funcionario;
import com.gustavo.dto.ClienteRequest;
import com.gustavo.dto.ClienteResponse;
import com.gustavo.dto.exception.IdNotValid;
import com.gustavo.dto.mappers.MapperClienteRequestToCliente;
import com.gustavo.repository.ClienteRepository;
import com.gustavo.service.ClienteService;
import com.gustavo.service.FuncionarioService;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/Cliente")
@RequiredArgsConstructor
public class ClienteController {
	
	
	private final ClienteService clienteservice = null;
	private final ClienteRepository clienteRepository = null;
	private final MapperClienteRequestToCliente mapperClienteRequestToCliente = null;

	@PostMapping
	public ClienteResponse cadastrarCliente (ClienteRequest clienteRequest) {
		if (clienteRequest.getIdcliente().floatValue() <= 5) {
			throw new IdNotValid ("Id não pode ser menor que 5");
		}
		Cliente clientecadastrado = ClienteService.atualizarCliente(clienteRequest);
		Cliente cliente = mapperClienteRequestToCliente.toModel(clienteRequest);
		
		ClienteResponse clienteResponse = new ClienteResponse();
		clienteResponse.setIdcliente(clientecadastrado.getIdcliente()); 
		clienteResponse.setnomeCliente(clientecadastrado.getnomeCliente());
		return clienteResponse;
	}
	@GetMapping("obterCliente/{id}")
	public ResponseEntity<ClienteResponse> obterCliente (@PathVariable ClienteRequest clienteRequest) {
		Cliente cliente = new Cliente();
		cliente.setIdcliente(clienteRequest.getnomeCliente());
		cliente.setnomeCliente(clienteRequest.getnomeCliente());
		
		Cliente clienteobtido = clienteservice.cadastrarCliente(cliente);
		
		ClienteResponse clienteResponse = new ClienteResponse();
		clienteResponse.setIdcliente(clienteobtido.getIdcliente()); 
		clienteResponse.setnomeCliente(clienteobtido.getnomeCliente());
		
		return ResponseEntity.created(null).body(clienteResponse);
		
	}
	@PatchMapping("atualizarCliente/{idCliente}")
	public ResponseEntity<ClienteResponse> atualizarCliente(@RequestBody ClienteRequest clienteRequest, @PathVariable long idCliente){
		Cliente cliente = new Cliente();
		cliente.setIdcliente(clienteRequest.getnomeCliente());
		cliente.setnomeCliente(clienteRequest.getnomeCliente());
		
		Cliente clienteatualizado = clienteservice.cadastrarCliente(cliente);
		
		ClienteResponse clienteResponse = new ClienteResponse();
		clienteResponse.setIdcliente(clienteatualizado.getIdcliente()); 
		clienteResponse.setnomeCliente(clienteatualizado.getnomeCliente());
		
		return ResponseEntity.created(null).body(clienteResponse);
	}

	@DeleteMapping("deletarCliente/{idCliente}")
	public ResponseEntity<Cliente> deletarCliente(@PathVariable long id){
		 return ResponseEntity.noContent().build();
		
	}

}