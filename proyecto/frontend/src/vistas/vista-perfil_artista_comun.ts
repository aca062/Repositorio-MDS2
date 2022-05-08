import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-listas_de_reproduccion_ajenas';
import './vista-canciones_mas_escuchadas';
import './vista-artistas_similares';
import './vista-lista_album';
import './vista-listas_de_reproduccion_propias';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-perfil_artista_comun')
export class VistaPerfil_artista_comun extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutPrincipal">
 <vaadin-vertical-layout style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="layoutPerfil">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center;" id="layoutDatosPerfil">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 1; align-self: center; align-items: center; width: fit-content;" id="layoutFoto">
    <img style="width: 200px; padding-top: var(--lumo-space-l); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);" src="https://i.scdn.co/image/ab6761610000e5eb6ad57a3cb26ae3ffd0f28f22" id="foto">
    <vaadin-button id="botonEditarFoto">
      Editar 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; width: 50%;" id="layoutDatos">
    <vaadin-horizontal-layout style="width: 100%; justify-content: flex-start; align-items: center;" id="layoutNombreBoton" theme="spacing-xl">
     <h5 id="h5Nombre">Bad Bunny</h5>
     <vaadin-button style="margin-right: 10%;" id="botonDejarSeguir">
       Dejar de seguir 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center;" id="layoutCorreo">
     <h5 id="h5Correo">bbunny@gmail.com</h5>
     <vaadin-button id="botonEditarCorreo">
       Editar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="layoutSeguidores">
    <h5 id="textoSeguidores">Seguidores</h5>
    <h5 id="numeroSeguidos">80000000</h5>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="layoutSeguidos">
    <h5 id="textoSeguidos">Seguidos</h5>
    <h5 id="numeroSeguidos1">10</h5>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button style="align-self: flex-end; margin: var(--lumo-space-m);" id="botonRecibirNotificaciones">
    Recibir notificaciones 
  </vaadin-button>
  <vaadin-button style="margin: var(--lumo-space-m); align-self: flex-end;" id="botonCrearNuevaLista">
    Crear una nueva lista 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-start;background-color: var(--lumo-contrast-10pct);" id="layoutTusListas">
  <vista-listas_de_reproduccion_propias style="margin-left: var(--lumo-space-xl);" id="tusListas"></vista-listas_de_reproduccion_propias>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-start; background-color: var(--lumo-contrast-10pct); padding-left: var(--lumo-space-xl);" id="layoutListasDondeAparece">
  <vista-listas_de_reproduccion_ajenas style="margin-left: var(--lumo-space-xl);" id="listasDondeAparece"></vista-listas_de_reproduccion_ajenas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="layoutInformacionArtista">
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutCancionesMasEscuchadas">
   <vista-canciones_mas_escuchadas style="align-self: center; padding: var(--lumo-space-l);" id="cancionesMasEscuchadas"></vista-canciones_mas_escuchadas>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 100%;" id="layoutArtistasSimilares">
   <vista-artistas_similares style="align-self: center; padding: var(--lumo-space-l);" id="artistasSimilares"></vista-artistas_similares>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutAlbumes">
   <vista-lista_album style="align-self: center; padding: var(--lumo-space-l);" id="albumes"></vista-lista_album>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="layoutFestivalesConciertos">
  <vaadin-horizontal-layout style="width: 100%; margin-left: var(--lumo-space-xl);" id="layoutCabeceraFestivales">
   <h2 style="margin-top: var(--lumo-space-xl); margin-right: var(--lumo-space-l); margin-left: var(--lumo-space-l); align-self: center;" id="h2FestivalesConciertos">Festivales y Conciertos</h2>
   <vaadin-button style="margin-top: var(--lumo-space-xl);" id="botonAnadirFestivalConcierto">
     Añadir 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="layoutFestivales">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutFestivalesIzq">
    <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;" id="festivalConcierto1">
     <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png" id="fechaFestivalConcierto1">
     <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l); align-self: center;" id="datosFestivalConcierto1">
      <h5 id="horaFestivalConcierto1">1.00</h5>
      <h5 id="lugarFestivalConcierto1">Capital One Arena</h5>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;" id="festivalConcierto11">
     <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png" id="fechaFestivalConcierto11">
     <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l);" id="datosFestivalConcierto11">
      <h5 id="horaFestivalConcierto11">1.00</h5>
      <h5 id="lugarFestivalConcierto11">State Farm Arena</h5>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutFestivalesDer">
    <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout14">
     <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;" id="festivalConcierto3">
      <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png" id="fechaFestivalConcierto3">
      <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l);" id="datosFestivalConcierto3">
       <h5 id="horaFestivalConcierto3">1.00</h5>
       <h5 id="lugarFestivalConcierto3">Spectrum Center</h5>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
     <vaadin-horizontal-layout style="object-fit: cover; margin: var(--lumo-space-l); align-self: center;" id="festivalConcierto4">
      <img style="width: 150px;" src="https://cdn-icons-png.flaticon.com/512/42/42956.png" id="fechaFestivalConcierto4">
      <vaadin-vertical-layout style="justify-content: space-around; margin-left: var(--lumo-space-l);" id="datosFestivalConcierto4">
       <h5 id="horaFestivalConcierto4">2.00</h5>
       <h5 id="lugarFestivalConcierto4">Amway Center</h5>
      </vaadin-vertical-layout>
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="layoutDarseBaja">
  <vaadin-button style="margin: var(--lumo-space-m);" id="botonDarseBaja">
    Darse de baja 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
