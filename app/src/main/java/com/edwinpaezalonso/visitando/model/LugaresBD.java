package com.edwinpaezalonso.visitando.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LugaresBD extends SQLiteOpenHelper {
    public LugaresBD(Context contexto) {
        super(contexto, "lugares", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase bd){
        bd.execSQL("CREATE TABLE lugares ("+
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "nombre TEXT, "+
                "foto TEXT, "+
                "descripcion TEXT, "+
                "direccion TEXT, "+
                "informacion TEXT, "+
                "precio TEXT, "+
                "horario TEXT)");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Iglesia Inmaculado Corazón de María', "+
                "'@drawable/catedral.jpg', "+
                "'Es la catedral de Girardot', "+
                "'Ubicada en el Parque Simón Bolívar', "+
                "'Es la catedral de Girardot y pertenece a la Diócesis de Girardot. Establecida por el Papa Pio XII el 29 de Mayo de 1.956. Su construcción fue finalizada en el año 1.978 y su inauguración se realizó el 16 de diciembre del mismo año. Su arquitectura tiene influencia alemana, ya que se construyó con el apoyo de la Acción Episcopal Adveniat. El diseñador fue el arquitecto Andrés Díaz Piedrahita', "+
                "'Sin costo', "+
                "'Libre Acceso')");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Hotel Unión', "+
                "'@drawable/hotel_union.jpg', "+
                "'Vista año 1.963', "+
                "'Cra. 12 No. 17 – 03', "+
                "'El 25 de mayo de 1.946, 75 socios en cabeza del señor Francisco Manzanera Enriquez, quien en 1.934 llega a Girardot proveniente de Barranquilla, dan inicio al Club Unión; un lugar de reunión de la élite girardoteña, que para entonces no tenía un espacio  para reunirse. Su influencia arquitectónica es europea y co el paso del tiempo dejó de ser club y se ha transformado en el Hotel Unión.', "+
                "'Sujeto a tarifas del Hotel', "+
                "'Las 24 horas')");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Parque Bolívar', "+
                "'@drawable/hotel_union.jpg', "+
                "'Inauguración año 1.965', "+
                "'Calle 18 entre carreras 11 y 12', "+
                "'Originalmente fue el parque Sucre. Actualmente se ubica en el barrio del mismo nombre. Es el parque principal de la ciudad y alrededor suyo se encuentran las sedes de la alcaldía, el Banco de la República, la catedral Inmaculado Corazón de María, la antigua sede de Telecom (hoy Movistar) y de la Empresa de Teléfonos de Girardot.', "+
                "'Sin costo', "+
                "'Las 24 horas')");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Parque Jorge Eliecer Gaitan', "+
                "'@drawable/hotel_union.jpg', "+
                "'Vista año 1.970', "+
                "'Carrera 14 con Calle 16', "+
                "'La estatua fue instalada en el mismo sitio que hoy conserva el 15 de mayo de 1.949, obra del escultor Bogotano Luis Pinto Maldonado. Se colocó sobre un  pedestal en piedra tallada, distinto al pedestal que tiene la escultura en la actualidad. Como dato curioso, la escultura aún se mantiene en su lugar original a pesar de dos incidentes: el monumento fue atacado a bala el 22 de enero de 1.952, y el 6 de abril de 1.953 la estatua fue derribada y puesta nuevamente el 12 de octubre del mismo año.', "+
                "'Sin costo', "+
                "'Las 24 horas')");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Monumento La Locomotora', "+
                "'@drawable/hotel_union.jpg', "+
                "'Vista año 1.947', "+
                "'Calle 16 con Cra 17', "+
                "'El Ferrocarril de Girardot inicia su construcción en el año 1.881 y entra en operación regular en el año 1.911. Los primeross 32 km se construyeron en 2 años y los restantes 100 km tardaron 25 años en su construcción. El primer tramo entre Girardot y Tocaima fue construído por el ingeniero Francisco Javier Cisneros, quien también estuvo a cargo de los trabajos del Ferrocarril de Antioquia. El Ferrocarril fue incorporado a los FFNN en el año 1.953. La locomotora que reposa como monumento en Girardot, la número 89 es marca Skoda de fabricación Checoslovaca.', "+
                "'Sin costo', "+
                "'Las 24 horas')");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Estación Ferrocarril', "+
                "'@drawable/hotel_union.jpg', "+
                "'Vista año 1.947', "+
                "'Calle 16 con Cra 17', "+
                "'Edificación construída en madera y hierro, en un estilo arquitectónico que evoca la tropicalidad.', "+
                "'Sin costo', "+
                "'Las 24 horas')");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Puente Férreo', "+
                "'@drawable/hotel_union.jpg', "+
                "'Vista año 1.930', "+
                "'Calle 16 con Cra 17', "+
                "'El río Magdalena era la barrera natural que impedía la interconexión de los ferrocarriles de Girardot y las líneas férreas que conectaban con Ibagué, Armenia y el pacífico colombiano. El gobierno decide la construcción del puente férreo sobre el río Magdalena en Girardot en el año 1.925, finalizando la obra en el año 1930, año en el cual fue inaugurado y comenzó a funcionar. La obra fue contratada con la firma  Sir W. G. Armstron Whitworth and Company Limited de Londres. La longitud total del puente es de 466 metros, sostenidos por 54 bases. La estructura facilitó la comunicación entre Tolima y Cundinamarca no sólo como corredor férreo, sino que permitió el paso a pie de  las personas para cruzar el río Magdalena utilizando el puente, ya que se construyó con una sección central para el paso del tren y dos secciones laterales a cada uno de los costados de la vía férrea para tránsito peatonal con escaleras en los dos extremos del lado de Flandes y de Girardot. El ancho total del puente es de 6,10 metros y la estructura de tiene un peso total de 1.500 toneladas.', "+
                "'Sin costo', "+
                "'Las 24 horas')");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'Camellón del Comercio', "+
                "'@drawable/hotel_union.jpg', "+
                "'Vista año 1.938', "+
                "'Calle 16', "+
                "'Entre las carreras 7 y 14, se ha convertido a lo largo de la historia en el epicentro de la actividad comercial de Girardot. Sede de las entidades financieras y de importantes hoteles.', "+
                "'Sin costo', "+
                "'Las 24 horas')");

        bd.execSQL("INSERT INTO lugares VALUES(null, "+
                "'El Gran Hotel', "+
                "'@drawable/hotel_union.jpg', "+
                "'Vista año 1.953', "+
                "'Contiguo a la Estación del Ferrocarril', "+
                "'Propiedad del señor José Aljure e inaugurado en el año 1.930, se convirtió en uno de los hoteles más importantes de Girardot y uno de los impulsores del turismo. Con capacidad para 150 personas y amplios salones y comedores que fueron sede de banquetes en homenaje a presidentes de la república, ministros, gobernadores y parlamentarios. En sus tribunas, figuras como Jorge Eliécer Gaitán,Enrique Olaya Herrera, Alfonso López, Guillermo León Valencia, Eduardo Santos; llevaron a cabo discursos públicos.', "+
                "'Sin costo', "+
                "'Las 24 horas')");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion){

    }


}