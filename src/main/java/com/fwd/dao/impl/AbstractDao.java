//package com.fwd.dao.impl;
//
//import javax.annotation.Resource;
//
//import org.hibernate.Criteria;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.bytecode.buildtime.spi.Logger;
//import org.hibernate.engine.spi.SessionFactoryImplementor;
//import org.hibernate.engine.spi.SessionImplementor;
//import org.hibernate.internal.CriteriaImpl;
//import org.hibernate.loader.criteria.CriteriaJoinWalker;
//import org.hibernate.loader.criteria.CriteriaQueryTranslator;
//import org.hibernate.persister.entity.OuterJoinLoadable;
//
//import com.fwd.model.iReminder.Document;
//
//abstract class AbstractDao {
//
//	@Resource
//	private SessionFactory sessionFactory;
//
////	protected void deleteDocument(Document document) {
////        Session session = sessionFactory.getCurrentSession();
////        session.delete(document);
////        logger.debug(document.getClass());
////    }
//	
//	protected Session session() {
//		return sessionFactory.getCurrentSession();
//	}
//	
//	protected Session delete(Document document) {
//		return sessionFactory.getCurrentSession();
//		document documentToDelete = getByDocumentName(document.getDocumentName());
//		
//	}
//	
//	
//	protected String escapeQuote(String value) {
//		return value.replace("'", "''");
//	}
//	
//	protected String extractToSQL(Criteria criteria) {
//		String strSQL ="";
//		
//		//extract Criteria to sql query
//		try {
//		CriteriaImpl criteriaImpl = (CriteriaImpl)criteria;
//			SessionImplementor session = criteriaImpl.getSession();
//			SessionFactoryImplementor factory = session.getFactory();
//			CriteriaQueryTranslator translator=new CriteriaQueryTranslator(factory,criteriaImpl,criteriaImpl.getEntityOrClassName(),CriteriaQueryTranslator.ROOT_SQL_ALIAS);
//			String[] implementors = factory.getImplementors( criteriaImpl.getEntityOrClassName() );
//			
//			CriteriaJoinWalker walker = new CriteriaJoinWalker((OuterJoinLoadable)factory.getEntityPersister(implementors[0]), 
//					translator,
//					factory, 
//					criteriaImpl, 
//					criteriaImpl.getEntityOrClassName(), 
//					session.getLoadQueryInfluencers()   );
//			
//			String sql=walker.getSQLString();
//			
//			strSQL =criteria.toString() + sql;
//			System.out.println(sql);
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    return strSQL;
//	}
//}
