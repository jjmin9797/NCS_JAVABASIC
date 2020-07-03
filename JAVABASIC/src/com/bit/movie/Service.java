package com.bit.movie;

import java.time.LocalDateTime;

public class Service {
	Repository repo = new ArrayRepository();
	PersonRepository<Actor> actorrepo = new ActorRepository();
	PersonRepository<Director> dirrepo = new DirectorRepository();
	public Movie[] findAllMovie() {
		return repo.findAll();
	}
	public Actor[] findAllactor() {
		return actorrepo.findAll();
	}
	public String rtActorName(int id) {
		return actorrepo.rtname(id);
	}
	public String rtDirName(long f) {
		return dirrepo.rtname(f);
	}
	public void saveMovie(Movie movie) {
		repo.save(new Movie(movie));
		
	}
	public Movie findOneByIdMovie(long edit) {
		return repo.findOneById(edit);
	}
	public void updateMovie(Movie movie) {
		repo.update(movie);
	}
	public void removeMovie(long del) {
		repo.remove(del);
	}
	public Object[] findAllDir() {
		return dirrepo.findAll();
	}
	public LocalDateTime rtdateDir() {
		return dirrepo.rtdate();
	}
	public void saveDir(Director sample1) {
		dirrepo.save(sample1);	
	}
	public Director findOneByIdDir(long edit) {
		return dirrepo.findOneById(edit);
	}
	public void updateDir(Director dir) {
		dirrepo.update(dir);		
	}
	public void removeDir(long del) {
		dirrepo.remove(del);		
	}
	public LocalDateTime rtdateActor() {
		return actorrepo.rtdate();
	}
	public void saveActor(Actor sample1) {
		actorrepo.save(sample1);		
	}
	public Actor findOneByIdActor(long edit) {
		return actorrepo.findOneById(edit);
	}
	public void updateActor(Actor actor) {
		actorrepo.update(actor);		
	}
	public void removeActor(long del) {
		actorrepo.remove(del);		
	}
	public String[] findMovie(String name) {
		return repo.findMovie(name);
	}
	public String[] findActor(String Movie) {
		return repo.findActor(Movie);
	}
}
