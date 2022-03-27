import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cabecera_pagina')
export class VistaCabecera_pagina extends LitElement {
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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); justify-content: space-between;" id="vaadinHorizontalLayout">
  <vaadin-button id="vaadinButton">
    Button 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end;" float="" margin-right="200px" id="vaadinHorizontalLayout1" margin="">
   <vaadin-button id="vaadinButton1">
    Ver perfil
   </vaadin-button>
   <vaadin-button id="vaadinButton2">
    Cerrar sesión
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto; justify-content: space-between;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout4" style="width: 100%; align-self: center; justify-content: center;">
   <vaadin-text-field placeholder="Search" id="vaadinTextField" style="width: 50%;">
    <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
   </vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout3" style="width: 100%; align-self: center; align-items: baseline; justify-content: center;background-color: var(--lumo-contrast-10pct);">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="width: 20%; justify-content: center; align-items: baseline; flex-grow: 1; flex-shrink: 0;">
    <h3 id="h3" style="align-self: center;">Contacto</h3>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 80%;">
    <h4 id="h4">+34 914257860</h4>
    <h4 id="h41">Heading 4</h4>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout class="footer" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);" id="vaadinHorizontalLayout2"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
