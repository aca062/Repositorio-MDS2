import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h2 id="h2" style="margin-left: var(--lumo-space-xl);">Dar de alta canción</h2>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; margin-left: var(--lumo-space-xl);background-color: var(--lumo-contrast-10pct);" id="vaadinVerticalLayout1">
  <vaadin-text-field label="Titulo" id="titulo" style="color: #000000" value="120"></vaadin-text-field>
  <vaadin-text-field label="Título álbum" id="títuloÁlbum" style="color: #000000; width: 10%;" value="El ultimo tour del mundo"></vaadin-text-field>
  <vaadin-text-field label="Compositores" id="compositores" style="color: #000000" value="Tainy"></vaadin-text-field>
  <vaadin-text-field label="Productores" id="productores" style="color: #000000" value="Tainy"></vaadin-text-field>
  <vaadin-text-field label="Interpretes" id="interpretes" style="color: #000000" value="Bad Bunny"></vaadin-text-field>
  <vaadin-select value="Urbano Latino" id="vaadinSelect" style="color: #000000">
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
  <vaadin-horizontal-layout id="vaadinHorizontalLayout6" style="align-self: flex-start; align-items: center; margin-left: var(--lumo-space-xl); width: 80%;background-color: var(--lumo-contrast-10pct);">
   <h4 id="h4">Fichero multimedia</h4>
   <vaadin-button id="vaadinButton" style="margin-left: 1%;">
     Añadir 
   </vaadin-button>
   <h5 id="h5" style="margin-left: 5%;">Solo son válidos los .mp3, .mp4, .ogg</h5>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout7" style="justify-content: flex-end; margin-left: 10%; width: 80%;">
   <vaadin-button id="vaadinButton1" style="flex-grow: 0; flex-shrink: 1; margin-right: 5%;">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="vaadinButton2" style="margin-right: 5%;">
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
