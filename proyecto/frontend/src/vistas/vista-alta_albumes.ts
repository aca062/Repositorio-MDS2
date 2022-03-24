import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h2 id="h2" style="margin-left: 10%;">Dar de alta álbum</h2>
 <vaadin-vertical-layout theme="spacing" style="margin-left: var(--lumo-space-xl); width: 100%; background-color: var(--lumo-contrast-10pct); height: 100%;">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 100%; height: 20%;" theme="spacing">
   <img id="img" src="https://i.scdn.co/image/ab67616d0000b273005ee342f4eef2cc6e8436ab">
   <vaadin-button id="vaadinButton" style="align-self: center;">
     Añadir imagen 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Titulo" id="titulo" style="width: 60%;color: #000000" value="El último tour del mundo"></vaadin-text-field>
  <vaadin-text-field label="Nombre artista" id="nombreArtista" style="width: 60%;color: #000000" value="Bad bunny"></vaadin-text-field>
  <vaadin-text-field label="Fecha edición" id="fechaEdición" style="width: 60%;color: #000000" value="27/11/2020"></vaadin-text-field>
  <vaadin-select value="Dakiti" id="vaadinSelect" style="width: 49%;color: #000000">
   <template>
    <vaadin-list-box id="vaadinListBox" selected="0">
     <vaadin-item id="vaadinItem" selected style="color: #000000">
      Dakiti
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
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout5" style="width: 100%; justify-content: flex-end;">
   <vaadin-button id="vaadinButton1" style="margin-right: 5%;">
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
