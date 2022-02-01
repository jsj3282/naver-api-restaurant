package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDBRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDBRepositoryAbstract<WishListEntity> {
}
