import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-alta_albumes')
export class VistaAlta_albumes extends LitElement {
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
 <h2 id="h2Titulo" style="margin-left: 10%;">Dar de alta álbum</h2>
 <vaadin-vertical-layout theme="spacing" style="margin-left: var(--lumo-space-xl); width: 90%; background-color: var(--lumo-contrast-10pct); height: 650pxç; padding: var(--lumo-space-xl);" id="layoutAlta">
  <vaadin-horizontal-layout id="layoutAlbum" style="width: 100%; height: 20%;" theme="spacing">
   <img id="imagen">
   <vaadin-upload id="vaadinUpload"></vaadin-upload>
   <vaadin-button id="eliminarFoto" style="align-self: center;">
     Eliminar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Titulo" id="titulo" style="width: 60%;color: #000000" value="El último tour del mundo" has-value></vaadin-text-field>
  <vaadin-text-field label="Nombre artista" id="nombreArtista" style="width: 60%;color: #000000" value="Bad bunny" has-value></vaadin-text-field>
  <vaadin-text-field label="Fecha edición" id="fechaEdicion" style="width: 60%;color: #000000" value="27/11/2020" has-value></vaadin-text-field>
  <vaadin-text-area id="canciones" style="width: 60%; height: 200px;" label="Canciones (Separadas por comas)"></vaadin-text-area>
  <vaadin-horizontal-layout theme="spacing" id="layoutBotones" style="width: 100%; justify-content: flex-end;">
   <vaadin-button id="cancelar" style="margin-right: 5%;">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="confirmar" style="margin-right: 5%;">
     Confirmar 
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
