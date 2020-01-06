package com.famanet.adapter.baseadapter;

		public interface IBaseAdapter<Entity> {

		public Entity create(Entity entity);
		public Entity update(Entity entity);
		public Entity delete(Entity entity);
		public Entity findAll(Entity entity);
		
	


}
