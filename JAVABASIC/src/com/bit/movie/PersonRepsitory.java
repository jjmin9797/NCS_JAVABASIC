package com.bit.movie;

import java.time.LocalDateTime;

interface PersonRepository <T> {
	public void save (T arg);
	public T[] findAll();
	public T findOneById(long id);
	public void update(T ob);
	public void remove(long id);
	public String rtname (long id) ;
	public LocalDateTime rtdate ();
}
