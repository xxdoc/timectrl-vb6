package cl.buildersoft.timectrl.api.com4j  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * ZKEM Class
   */
  public static cl.buildersoft.timectrl.api.com4j.IZKEM createCZKEM() {
    return COM4J.createInstance( cl.buildersoft.timectrl.api.com4j.IZKEM.class, "{00853A19-BD51-419B-9269-2DABE57EB61F}" );
  }

  public static cl.buildersoft.timectrl.api.com4j._zkemProxy createzkemProxy() {
    return COM4J.createInstance( cl.buildersoft.timectrl.api.com4j._zkemProxy.class, "{75566AA4-B40F-4341-82E4-D0220EDC6DB1}" );
  }

  public static cl.buildersoft.timectrl.api.com4j._ZKProxy2 createZKProxy2() {
    return COM4J.createInstance( cl.buildersoft.timectrl.api.com4j._ZKProxy2.class, "{452D6609-DB48-4CA0-832A-43533BB22531}" );
  }
}
