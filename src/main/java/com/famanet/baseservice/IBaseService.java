package com.famanet.baseservice;

public interface IBaseService<Entity> {
	
		public Entity create(Entity entity);
		public Entity update(Entity entity);
		public Entity delete(Entity entity);
		public Entity findAll(Entity entity);
		
	

}
