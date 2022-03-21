import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;">
  <vaadin-button style="text-align: center;">
   Administración
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%;"></vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing">
   <h2 style="margin-left: var(--lumo-space-xl);">Nuestras recomendaciones</h2>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
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
    <img style="width: 150px;" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png">
    <h3>Nombre artista</h3>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%; align-items: center; align-self: center;">
    <h3>Canción más escuchada</h3>
    <img style="width: 150px;" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_960_720.png">
    <h3>Nombre canción</h3>
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
