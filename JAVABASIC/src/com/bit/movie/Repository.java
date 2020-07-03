package com.bit.movie;

public interface Repository {
	void save(Movie arg);
	Movie[] findAll();
	Movie findOneById(long id);
	void update(Movie movie);
	void remove(long id);

}
