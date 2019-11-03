package br.com.estoqueifsp.webapi.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.estoqueifsp.webapi.entity.Local;
import br.com.estoqueifsp.webapi.repository.LocalRepository;

@RestController
public class LocalController{
    @Autowired
    private LocalRepository _localRepository;

    //listar Todos
    @CrossOrigin
    @RequestMapping(value = "/local", method = RequestMethod.GET)
    public List<Local> Get(){
        return _localRepository.findAll();
    }

    //novo Local
    @CrossOrigin
    @RequestMapping(value = "/local", method = RequestMethod.POST)
    public Local Post(@Valid @RequestBody Local local){
        return _localRepository.save(local);
    }

    //alterar Local
    @CrossOrigin
    @RequestMapping(value = "/local/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Local> Put(@PathVariable(value = "id") long id, @Valid @RequestBody Local newLocal){
        Optional<Local> oldLocal = _localRepository.findById(id);
        if(oldLocal.isPresent()){
            Local local = oldLocal.get();
            local.setName(newLocal.getName());
            local.setAdress(newLocal.getAdress());
            local.setPostCode(newLocal.getPostCode());
            local.setCity(newLocal.getCity());
            local.setState(newLocal.getState());
            local.setObs(newLocal.getObs());

            _localRepository.save(local);
            return new ResponseEntity<Local>(local, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }        
    }

    //deletar Local
    @CrossOrigin
    @RequestMapping(value="/local/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Local> Delete(@PathVariable(value = "id") long id) {
        Optional<Local> local = _localRepository.findById(id);
        if(local.isPresent()){
            _localRepository.delete(local.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }    
}