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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;background-color: var(--lumo-contrast-10pct);">
  <vaadin-button style="text-align: center;">
    Administración 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vista-ultimas_canciones_reproducidas></vista-ultimas_canciones_reproducidas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%;background-color: var(--lumo-contrast-10pct);">
  <vista-canciones_favoritas></vista-canciones_favoritas>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing">
   <h2 style="margin-left: var(--lumo-space-xl);">Nuestras recomendaciones</h2>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vista-canciones_recomendadas style="align-self: center;"></vista-canciones_recomendadas>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vista-artistas_recomendados style="align-self: center;"></vista-artistas_recomendados>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <vista-listas_de_reproduccion_recomendadas style="align-self: center;"></vista-listas_de_reproduccion_recomendadas>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing">
   <h2 style="margin-left: var(--lumo-space-xl);">Tus estadísticas de uso</h2>
   <vaadin-button style="align-self: center;">
     Ver todas 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%; align-self: center; align-items: center;">
    <h3>Artista más escuchado</h3>
    <img style="width: 150px;" src="https://www.runneruprecords.com/wp-content/uploads/2019/12/Juice-Wrld-promesa-del-rap-muere.jpg">
    <h3>Juice WRLD</h3>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; align-self: center;">
    <h3>Canción más escuchada</h3>
    <img style="width: 150px;" src="https://i.scdn.co/image/ab67616d0000b273510aa550d334384b01cad546">
    <h3>Smile</h3>
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
