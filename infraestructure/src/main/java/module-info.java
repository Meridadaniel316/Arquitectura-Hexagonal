module co.com.arquitectura.infraestructure {
    requires java.sql;
    requires org.slf4j;
    requires lombok;
    requires co.com.arquitectura.application;
    requires co.com.arquitectura.domain;

    exports infraestructure;

}
