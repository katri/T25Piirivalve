// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ee.itcollege.T25Piirivalve.entities;

import ee.itcollege.T25Piirivalve.entities.VAHTKOND_PIIRILOIGUL;
import java.lang.Long;
import java.util.List;

privileged aspect VAHTKOND_PIIRILOIGUL_Roo_Entity {
    
    public static long VAHTKOND_PIIRILOIGUL.countVAHTKOND_PIIRILOIGULs() {
        return entityManager().createQuery("SELECT COUNT(o) FROM VAHTKOND_PIIRILOIGUL o", Long.class).getSingleResult();
    }
    
    public static List<VAHTKOND_PIIRILOIGUL> VAHTKOND_PIIRILOIGUL.findAllVAHTKOND_PIIRILOIGULs() {
        return entityManager().createQuery("SELECT o FROM VAHTKOND_PIIRILOIGUL o", VAHTKOND_PIIRILOIGUL.class).getResultList();
    }
    
    public static VAHTKOND_PIIRILOIGUL VAHTKOND_PIIRILOIGUL.findVAHTKOND_PIIRILOIGUL(Long id) {
        if (id == null) return null;
        return entityManager().find(VAHTKOND_PIIRILOIGUL.class, id);
    }
    
    public static List<VAHTKOND_PIIRILOIGUL> VAHTKOND_PIIRILOIGUL.findVAHTKOND_PIIRILOIGULEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM VAHTKOND_PIIRILOIGUL o", VAHTKOND_PIIRILOIGUL.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}