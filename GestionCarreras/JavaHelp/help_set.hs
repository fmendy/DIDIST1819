<helpset version="1.0">
	<title>Ayuda en Gestion de carreras</title>
	<maps>
		<!-- Pagina por defecto al mostrar la ayuda -->
		<homeID>indice</homeID>
		<!--el mapa que va a cargar-->
		<mapref location="map_file.jhm">
	</maps>
	<view>
		<!-- Las vistas que se van a mostrar-->
		<name>Tabla de contenidos</name>
		<label>Table de contenidos</label>
		<type>java.help.TOCView</type>
		<data>toc.xml</toc>
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
		<label>Buscar</name>
		<type>javax.help.SearchView</type>
		<data engine="com.sun.java.help.search.DefaultSearchEngine">
			JavaHelpSearch
		</data>
	<view>
</helpset>