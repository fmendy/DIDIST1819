<helpset version="1.0">
	<title>Ayuda en Gestion de carreras</title>
	<maps>
		<!-- Pagina por defecto al mostrar la ayuda -->
		<homeID>indice</homeID>
		<!--el mapa que va a cargar-->
		<mapref location="map_file.jhm">
	</maps>
	<view>
        <name>Tabla Contenidos</name>
        <label>Tabla de contenidos</label>
        <type>javax.help.TOCView</type>
        <data>toc.xml</data>
    </view>	
	<view>
		<!-- Indicie por el que se busca-->
		<name>Indice</name>
		<label>EL indice</label>
		<type>javax.help.IndexView</type>
		<data>indice.xml</data>
	</view>
	<view>
		<name>Buscar</name>
		<label>Buscar</label>
		<type>javax.help.SearchView</type>
		<data engine="com.sun.java.help.search.DefaultSearchEngine">
			JavaHelpSearch
		</data>
	</view>
</helpset>