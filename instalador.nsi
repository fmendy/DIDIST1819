# nombre del instalador
OutFile "InstaladorCarrera.exe"
 
# establecemos el escritorio como directorio de instalacion
InstallDir $DESKTOP
 
 #Cambiar el idioma
!include "MUI.nsh"
!insertmacro MUI_LANGUAGE "Spanish"

# mostar elegir directorio
 Page directory
 Page instfiles
# seccion del instalador
Section
 
	# definimos el directorio a donde vamos a extraer el test.txt
	SetOutPath "$INSTDIR\Carrera"
	 
	# especificamos el archivo
	File /r "..\GestionCarreras"
	
	# Creamos el acceso en el escritorio
	CreateShortCut "$DESKTOP\Carreras.lnk" "$INSTDIR\Carrera\DIDIST1819\GestionCarreras\dist\GestionCarreras.jar"
	# Creamos el acceso en el menu
	CreateShortCut "$SMPROGRAMS\Carreras.lnk" "$INSTDIR\Carrera\DIDIST1819\GestionCarreras\dist\GestionCarreras.jar"
	 
	# definimos el desinstalador y su nombre
	 WriteUninstaller $INSTDIR\uninstaller.exe
	 
	# fin de la seccion con el instalador
SectionEnd

Section "Uninstall"
	 
	# Borramos primero el desinstalador
	Delete $INSTDIR\uninstaller.exe
	 
	# borramos el acceso directorio
	Delete "$DESKTOP\Carreras.lnk"
	Delete "$SMPROGRAMS\Carreras.lnk"
	
	#Borramos el lugar donde se instalo
	RMDir /r "$INSTDIR\Carrera"
SectionEnd