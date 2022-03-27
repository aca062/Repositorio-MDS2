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
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 50%; align-self: center; align-items: center;background-color: var(--lumo-contrast-10pct);">
  <vaadin-text-field label="Nombre" placeholder="" id="nombre" style="margin-left: var(--lumo-space-xl); align-self: flex-start;" value="Vibes Up"></vaadin-text-field>
  <vaadin-select value="Buscador de canciones" id="vaadinSelect" style="margin-left: var(--lumo-space-xl); width: 30%; align-self: flex-start;" label="Lista de canciones">
   <template>
    <vaadin-list-box id="vaadinListBox1" selected="0">
     <vaadin-item selected id="vaadinItem3">
       Buscador de canciones 
     </vaadin-item>
     <vaadin-item id="vaadinItem4">
       Item two 
     </vaadin-item>
     <vaadin-item id="vaadinItem5">
       Item three 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 85%; margin-left: var(--lumo-space-xl); flex-grow: 0; align-self: flex-start;">
   <vaadin-list-box id="vaadinListBox">
    <vaadin-item id="vaadinItem" style="flex-grow: 0; flex-shrink: 0;">
      Heading Up High 
     <vaadin-button id="vaadinButton" style="flex-grow: 0; margin-left: var(--lumo-space-xl);">
       Eliminar 
     </vaadin-button>
    </vaadin-item>
    <vaadin-item id="vaadinItem1">
      California 
     <vaadin-button style="flex-grow: 0; margin-left: var(--lumo-space-xl);" id="vaadinButton1">
       Eliminar 
     </vaadin-button>
    </vaadin-item>
    <vaadin-item id="vaadinItem2">
      Leave a Light On 
     <vaadin-button style="flex-grow: 0; margin-left: var(--lumo-space-xl);" id="vaadinButton2">
       Eliminar 
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
