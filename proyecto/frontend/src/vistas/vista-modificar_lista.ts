import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-modificar_lista')
export class VistaModificar_lista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start;" id="vaadinVerticalLayout">
 <h2 id="h2" style="margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-xl);">Editar lista de reproducción</h2>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
  <vaadin-text-field label="Nombre" placeholder="" id="nombre" style="margin-left: var(--lumo-space-xl);"></vaadin-text-field>
  <vaadin-select value="Item one" id="vaadinSelect" style="margin-left: var(--lumo-space-xl);">
   <template>
    <vaadin-list-box>
     <vaadin-item selected>
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
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 85%; margin-left: var(--lumo-space-xl); flex-grow: 0;">
   <vaadin-list-box id="vaadinListBox" style="width: 85%;">
    <vaadin-item id="vaadinItem" style="flex-grow: 0; flex-shrink: 0;">
      Item one 
     <vaadin-button id="vaadinButton" style="flex-grow: 0; margin-left: var(--lumo-space-xl);">
       Button 
     </vaadin-button>
    </vaadin-item>
    <vaadin-item id="vaadinItem1">
      Item two 
     <vaadin-button style="flex-grow: 0; margin-left: var(--lumo-space-xl);" id="vaadinButton1">
       Button 
     </vaadin-button>
    </vaadin-item>
    <vaadin-item id="vaadinItem2">
     Item three
     <vaadin-button style="flex-grow: 0; margin-left: var(--lumo-space-xl);" id="vaadinButton2">
       Button 
     </vaadin-button>
    </vaadin-item>
   </vaadin-list-box>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout1" style="width: 100%; justify-content: flex-end;">
   <vaadin-button id="vaadinButton3">
    Cancelar
   </vaadin-button>
   <vaadin-button id="vaadinButton4" style="margin-right: 15%;">
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
