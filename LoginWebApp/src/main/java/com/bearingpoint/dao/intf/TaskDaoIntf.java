/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bearingpoint.dao.intf;

import java.io.Serializable;
import java.util.List;

public interface TaskDaoIntf<T, Id extends Serializable>  {

	 public void persist(T entity);

	    public void update(T entity);

	    public T findById(Id id);

	    public void delete(T entity);

	    public List<T> findAll();

	    public void deleteAll();

}
