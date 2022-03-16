import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-menu_administracion')
export class VistaMenu_administracion extends LitElement {
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
 <h2 id="h2" style="align-self: center;">Administración</h2>
 <vaadin-vertical-layout id="vaadinVerticalLayout1" style="width: 90%; height: 90%; margin-top: 1%; margin-bottom: 5%; align-self: center;background-color: var(--lumo-contrast-10pct);">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: center; flex-grow: 0; flex-shrink: 1; justify-content: center; align-items: flex-start; width: 100%;">
   <vaadin-button id="vaadinButton1" style="align-self: flex-start; flex-grow: 0; margin: var(--lumo-space-xl); width: 20%;">
    Buscar elemento
   </vaadin-button>
   <vaadin-button id="vaadinButton2" style="margin: var(--lumo-space-xl); width: 20%;">
    Dar de alta
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="width: 100%; height: 20%; align-self: flex-start; align-items: center; justify-content: space-around;">
   <h4 id="h4" style="width: 50%; height: 25%;">Límite de canciones a reproducir por un usuario no registrado</h4>
   <vaadin-button id="vaadinButton">
    <iron-icon icon="lumo:edit" slot="prefix"></iron-icon> Edit 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="width: 100%; height: 20%; align-items: center; justify-content: space-around;">
   <h4 style="width: 50%; height: 25%; flex-grow: 0;">Canciones mostradas a un usuario no registrado</h4>
   <vaadin-button>
    <iron-icon icon="lumo:edit" slot="prefix"></iron-icon> Edit 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-list-box id="vaadinListBox" style="width: 95%; height: 100%; align-self: flex-start; margin-right: var(--lumo-space-l); margin-bottom: var(--lumo-space-l); margin-left: var(--lumo-space-l); margin-top: var(--lumo-space-l); flex-grow: 0;">
   <vaadin-item id="vaadinItem" style="align-self: flex-start; width: 100%;">
     Item one 
   </vaadin-item>
   <vaadin-item id="vaadinItem1" style="width: 100%;">
     Item two 
   </vaadin-item>
   <hr id="hr">
   <vaadin-item id="vaadinItem2" style="width: 100%;">
     Item three 
   </vaadin-item>
   <vaadin-item id="vaadinItem3" style="width: 100%;">
     Item four 
   </vaadin-item>
  </vaadin-list-box>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
