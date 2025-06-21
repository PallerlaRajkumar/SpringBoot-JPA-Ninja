package org.example.store.repositories;

import org.example.store.dtos.ProductSummary;
import org.example.store.dtos.ProductSummaryDTO;
import org.example.store.entities.Category;
import org.example.store.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> , ProductCriteriaRepository, JpaSpecificationExecutor<Product> {

  List<Product> findByName( String name);
  List<Product> findByNameLike( String name);
  List<Product> findByNameNotLike( String name);
  List<Product> findByNameContaining( String name);
  List<Product> findByNameStartingWith( String name);
  List<Product> findByNameEndingWithIgnoreCase( String name);
  // select * from products where name like ?

  //Numbers
  List<Product> findByPrice(BigDecimal price);
  //select * from products where price
  List<Product> findByPriceGreaterThan(BigDecimal price);
  List<Product> findByPriceGreaterThanEqual(BigDecimal price);
  List<Product> findByPriceLessThan(BigDecimal price);
  List<Product> findByPriceLessThanEqual(BigDecimal price);
  List<Product> findByPriceBetween(BigDecimal min, BigDecimal max);

  //Null
  List<Product> findByDescriptionIsNull();
  List<Product> findByDescriptionIsNotNull();

  // Multiple conditions

  List<Product> findByDescriptionNullAndNameNull();

  //Sort (OrderBy)

  List<Product> findByNameOrderByPriceAsc(String name);
  List<Product> findByNameOrderByPriceDesc(String name);


  //Limit (Top/First)
  List<Product> findTop5ByNameOrderByPrice(String name);
  List<Product> findFirst5ByNameOrderByPriceAsc(String name);

  //Find products whose prices are in a given range and sort by name
  // SQL or JPQL
  //@Query(value = "select * from products p where p.price between :min and :max order by p.name", nativeQuery = true)
  //@Query("select p from Product p join p.category where p.price between :min and :max order by p.name")
//  @Procedure(name = "findProductsByPrice")
//  List<Product> findProducts(BigDecimal min,  BigDecimal max);

  @Procedure(procedureName = "findProductsByPrice")
  List<Product> findProducts( BigDecimal min,  BigDecimal max);


  @Query("select count(*) from Product p where p.price between :min and :max")
  long countProducts(@Param("min")BigDecimal min, @Param("max") BigDecimal max);

  @Modifying
  @Query("update Product p set p.price = :newPrice where p.category.id = :categoryId")
  void updatePriceByCategory(BigDecimal newPrice, Byte categoryId);

@Query("select new org.example.store.dtos.ProductSummaryDTO(p.id, p.name)  from Product p where p.category = :category")
  List<ProductSummaryDTO>  findByCategory(@Param("category") Category category);




}