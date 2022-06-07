import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-editar_album')
export class VistaEditar_album extends LitElement {
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
 <h2 id="h2Titulo" style="margin-left: 10%;">Editar album</h2>
 <vaadin-vertical-layout style="width: 90%; margin-left: var(--lumo-space-xl); background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl); height: 630px;" id="layoutAlbumes">
  <vaadin-horizontal-layout theme="spacing" id="layoutAlbum" style="width: 100%; height: 20%; justify-content: flex-start; align-self: center;">
   <img id="imgAlbum" src="https://i.scdn.co/image/ab67616d0000b273005ee342f4eef2cc6e8436ab">
   <vaadin-button id="cambiarImagen" style="flex-grow: 0; align-self: center;">
     Cambiar imagen 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Nombre artista " style="width: 80%; align-self: flex-start;" id="nombreArtista" value="Bad bunny" has-value></vaadin-text-field>
  <vaadin-text-field label="Fecha edición" style="width: 80%; align-self: flex-start;" id="fechaEdición" value="27/11/2020" has-value></vaadin-text-field>
  <vaadin-text-field label="Titulo" id="titulo" style="width: 80%; align-self: flex-start;" value="El último tour del mundo" has-value></vaadin-text-field>
  <vaadin-text-area id="listaCanciones" style="width: 80%;" label="Canciones"></vaadin-text-area>
  <vaadin-horizontal-layout theme="spacing" id="layoutBotones" style="align-self: flex-end; margin-top: var(--lumo-space-s);">
   <vaadin-button id="confirmar">
     Confirmar 
   </vaadin-button>
   <vaadin-button id="cancelar">
     Cancelar 
   </vaadin-button>
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
