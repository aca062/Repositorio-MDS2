import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-ultimas_canciones_reproducidas';
import './vista-canciones_favoritas';
import './vista-canciones_recomendadas';
import './vista-artistas_recomendados';
import './vista-listas_de_reproduccion_recomendadas';

@customElement('vista-actor_comun')
export class VistaActor_comun extends LitElement {
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
<vaadin-vertical-layout id="layoutPrincipal">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="layoutAdministracion">
  <vaadin-button style="text-align: center; padding: var(--lumo-space-xl); padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-xl);" id="botonAdmin">
    Administración 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="layoutUltimasCanciones">
  <vista-ultimas_canciones_reproducidas id="vistaUltimas_canciones_reproducidas" style="padding: var(--lumo-space-m);"></vista-ultimas_canciones_reproducidas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%;background-color: var(--lumo-contrast-10pct);" id="layoutCancionesFav">
  <vista-canciones_favoritas id="vistaCanciones_favoritas" style="padding: var(--lumo-space-m);"></vista-canciones_favoritas>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutRecomendaciones">
  <vaadin-horizontal-layout theme="spacing" id="layoutTituloRecomendaciones">
   <h2 style="margin-left: var(--lumo-space-xl);" id="h2Recomendaciones">Nuestras recomendaciones</h2>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="layoutListasRecomendaciones">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutCanciones">
    <vista-canciones_recomendadas style="align-self: center;" id="vistaCanciones_recomendadas"></vista-canciones_recomendadas>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutArtistas">
    <vista-artistas_recomendados style="align-self: center;" id="vistaArtistas_recomendados"></vista-artistas_recomendados>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutListas">
    <vista-listas_de_reproduccion_recomendadas style="align-self: center;" id="vistaListas_de_reproduccion_recomendadas"></vista-listas_de_reproduccion_recomendadas>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="layoutEstadisticas">
  <vaadin-horizontal-layout theme="spacing" id="layoutTituloEstadisticas" style="align-items: center; flex-shrink: 0;">
   <h2 style="margin-left: var(--lumo-space-xl); align-self: center; flex-shrink: 0; margin-top: 0; margin-bottom: 0" id="h21Titulo">Tus estadísticas de uso</h2>
   <vaadin-button style="align-self: center; flex-shrink: 0;" id="botonVerMasEstadisticas">
     Ver todas 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="layoutMasEscuchadas">
   <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center; align-items: center;" id="layoutArtistaMas">
    <h3 id="h33TituloArtistaMas">Artista más escuchado</h3>
    <img style="width: 150px;" src="https://www.runneruprecords.com/wp-content/uploads/2019/12/Juice-Wrld-promesa-del-rap-muere.jpg" id="img1Artista">
    <h3 id="h32NombreArtistaMas">Juice WRLD</h3>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; align-self: center;" id="layoutCancionMas">
    <h3 id="h31TituloCancionMas">Canción más escuchada</h3>
    <img style="width: 150px;" src="https://i.scdn.co/image/ab67616d0000b273510aa550d334384b01cad546" id="imgCancionMas">
    <h3 id="h3NombreCancionMas">Smile</h3>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
