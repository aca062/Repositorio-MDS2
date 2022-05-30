import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';

@customElement('vista-alta_canciones')
export class VistaAlta_canciones extends LitElement {
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
 <h2 id="h2Titulo" style="margin-left: var(--lumo-space-xl);">Dar de alta canción</h2>
 <vaadin-vertical-layout theme="spacing" style="width: 90%; margin-left: var(--lumo-space-xl); background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl); height: 760px;" id="layoutCnacion">
  <vaadin-text-field label="Titulo" id="titulo" style="color: #000000; width: 60%;" value="120" has-value></vaadin-text-field>
  <vaadin-text-field label="Título álbum" id="títuloÁlbum" style="color: #000000; width: 60%;" value="El ultimo tour del mundo" has-value></vaadin-text-field>
  <vaadin-text-field label="Compositores" id="compositores" style="color: #000000; width: 60%;" value="Tainy" has-value></vaadin-text-field>
  <vaadin-text-field label="Productores" id="productores" style="color: #000000; width: 60%;" value="Tainy" has-value></vaadin-text-field>
  <vaadin-text-field label="Interpretes" id="interpretes" style="color: #000000; width: 60%;" value="Bad Bunny" has-value></vaadin-text-field>
  <vaadin-select value="Urbano Latino" id="estilo" style="color: #000000">
   <template>
    <vaadin-list-box selected="0" id="vaadinListBox">
     <vaadin-item style="color: #000000" selected id="vaadinItem">
       Urbano Latino 
     </vaadin-item>
     <vaadin-item id="vaadinItem1">
       Item two 
     </vaadin-item>
     <vaadin-item id="vaadinItem2">
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
  <vaadin-horizontal-layout id="layoutAnadirCnacion" style="align-self: flex-start; align-items: center; margin-left: var(--lumo-space-xl); width: 80%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-m);">
   <h4 id="h4Fichero">Fichero multimedia</h4>
   <vaadin-upload id="vaadinUpload"></vaadin-upload>
   <vaadin-button id="botonEliminar" style="width: 120px; margin: var(--lumo-space-l); margin-right: 0;">
     Eliminar 
   </vaadin-button>
   <h5 id="h5Requisitos" style="margin-left: 5%;">Solo son válidos los .mp3, .mp4, .ogg</h5>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="layoutBotones" style="justify-content: flex-end; margin-left: 10%; width: 80%;">
   <vaadin-button id="cancelar" style="flex-grow: 0; flex-shrink: 1; margin-right: 5%;">
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
