package com.infinite.dao;

import java.io.Serializable;

public interface EntityDAO<T, PK extends Serializable> {

	T create(T t);
	
    T read(PK id);
    
    T update(T t);
    
    void delete(T t);
}
