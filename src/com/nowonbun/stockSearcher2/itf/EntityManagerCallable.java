package com.nowonbun.stockSearcher2.itf;

import javax.persistence.EntityManager;

public interface  EntityManagerCallable<V> {
	V run(EntityManager em);
}
