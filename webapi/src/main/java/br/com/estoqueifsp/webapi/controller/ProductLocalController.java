// package br.com.estoqueifsp.webapi.controller;

// import java.util.List;
// import java.util.Optional;

// import javax.validation.Valid;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// import br.com.estoqueifsp.webapi.entity.ProductLocal;
// import br.com.estoqueifsp.webapi.repository.ProductLocalRepository;


// @RestController
// public class ProductLocalController{
//     @Autowired
//     private ProductLocalRepository _productLocalRepository;

//     //listar Todos
//     @CrossOrigin
//     @RequestMapping(value = "/productLocal/{localId}", method = RequestMethod.GET)
//     public List<ProductLocal> Get(@PathVariable(value = "localId") long localId, @Valid @RequestBody ProductLocal newProductLocal){
//         List<ProductLocal> ProductLocal = _productLocalRepository.findAll();
        
//         return ProductLocal;
        
//     }

//     //novo Produto
// //     @CrossOrigin
// //     @RequestMapping(value = "/product", method = RequestMethod.POST)
// //     public Product Post(@Valid @RequestBody Product product){
// //         return _productRepository.save(product);
// //     }

// //     //alterar Produto
// //     @CrossOrigin
// //     @RequestMapping(value = "/product/{id}", method = RequestMethod.PUT)
// //     public ResponseEntity<Product> Put(@PathVariable(value = "id") long id, @Valid @RequestBody Product newProduct){
// //        Optional<Product> oldProduct = _productRepository.findById(id);
// //        if(oldProduct.isPresent()){
// //             Product product = oldProduct.get();
// //             product.setName(newProduct.getName());
// //             product.setType(newProduct.getType());
// //             product.setUn(newProduct.getUn());

// //            _productRepository.save(product);
// //             return new ResponseEntity<Product>(product, HttpStatus.OK);
// //         }else{
// //            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
// //         }        
// //     }

// //    //deletar Produto
// //     @CrossOrigin
// //     @RequestMapping(value="/product/{id}", method=RequestMethod.DELETE)
// //     public ResponseEntity<Product> Delete(@PathVariable(value = "id") long id) {
// //         Optional<Product> product = _productRepository.findById(id);
// //         if(product.isPresent()){
// //             _productRepository.delete(product.get());
// //           return new ResponseEntity<>(HttpStatus.OK);
// //        }else{
// //           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
// //       }
// //     }    
// }
