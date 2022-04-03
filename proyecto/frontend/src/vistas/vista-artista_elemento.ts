import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-artista_elemento')
export class VistaArtista_elemento extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 200px; align-items: flex-start; justify-content: center;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="padding: var(--lumo-space-s); width: 100%; align-items: center; height: 200px;">
  <img id="img" style="height: 150px; width: 150px; object-fit: contain;" src="https://www.runneruprecords.com/wp-content/uploads/2019/12/Juice-Wrld-promesa-del-rap-muere.jpg">
  <vaadin-button id="vaadinButton" style="align-self: center; margin: var(--lumo-space-m);">
    Juice WRLD 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
