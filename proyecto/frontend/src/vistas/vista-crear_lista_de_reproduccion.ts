import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-crear_lista_de_reproduccion')
export class VistaCrear_lista_de_reproduccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; margin: var(--lumo-space-l);" id="vaadinVerticalLayout">
 <h2 id="h2">Crear lista de reproducción</h2>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
  <vaadin-text-field label="Label" placeholder="Placeholder" id="label" style="width: 70%;"></vaadin-text-field>
  <vaadin-select value="Item one" id="vaadinSelect" style="width: 70%;">
   <template>
    <vaadin-list-box>
     <vaadin-item>
       Item one 
     </vaadin-item>
     <vaadin-item>
       Item two 
     </vaadin-item>
     <vaadin-item>
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
  <vaadin-list-box id="vaadinListBox" style="width: 70%;">
   <b>Select an Item</b>
   <vaadin-item id="vaadinItem">
     Item one 
   </vaadin-item>
   <vaadin-item id="vaadinItem1">
     Item two 
   </vaadin-item>
   <hr id="hr">
   <vaadin-item id="vaadinItem2">
     Item three 
   </vaadin-item>
   <vaadin-item id="vaadinItem3">
     Item four 
   </vaadin-item>
  </vaadin-list-box>
  <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout" style="width: 100%; justify-content: flex-end;">
   <vaadin-button id="vaadinButton" style="margin: var(--lumo-space-xl);">
    Cancelar
   </vaadin-button>
   <vaadin-button id="vaadinButton1" style="margin: var(--lumo-space-xl);">
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
